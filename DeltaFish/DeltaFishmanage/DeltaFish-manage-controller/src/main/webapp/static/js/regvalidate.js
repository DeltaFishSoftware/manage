$(document).ready(function() {
        $("#email").click(function() {
        var $email = $("#email"),
            emailVal = $.trim($email.val());
        if (emailVal.length == 0) {
            $("#emailinfo .notice").text("请输入一个有效的邮箱地址");
        } else {
            $("#emailinfo .notice").empty();
        }
    }),
        $("#userName").click(function() {
            var $username = $("#userName"),
                usernameVal = $.trim($username.val());
            if (usernameVal.length == 0) {
                $("#userNameinfo .notice").text("请输入 3-20 位字符的用户名,作为您的唯一标识");
            } else {
                $("#userNameinfo .notice").empty();
            }
        }),
        $("#password").click(function() {
            var $password = $("#password"),
                passwordVal = $.trim($password.val());
            if (passwordVal.length == 0) {
                $("#passwordinfo .notice").text("请输入 6-16 位数字、字母或常用符号，字母区分大小写");
            } else {
                $("#passwordinfo .notice").empty();
            }
        }),
        $("#password2").click(function() {
            var $password2 = $("#password2"),
                password2Val = $.trim($password2.val());
            if (password2Val.length == 0) {
                $("#password2info .notice").text("请输入6-16位数字、字母或常用符号，字母区分大小写");
            } else {
                $("#password2info .notice").empty();
            }
        }),
        $("#captcha").click(function() {
            var $captcha = $("#captcha"),
                captchaVal = $.trim($captcha.val());
            if (captchaVal.length == 0) {
                $("#captchainfo .notice").text("请输入图片中的验证码");
            } else {
                $("#captchainfo .notice").empty();
            }
        }),

        $("#email,#userName,#password,#password2").change(function() {
            $("#emailinfo .notice").empty();
            $("#userNameinfo .notice").empty();
            $("#passwordinfo .notice").empty();
            $("#password2info .notice").empty();
        }),

        $("#regform").validate({

            ignore: ".ignore",
            rules: {
                email: {
                    required: true,
                    email: true
                },
                userName: {
                    required: true,
                    minlength: 3,
                    maxlength: 20,
/*                    remote: {
                        url:"checkUser.do",
                        type:"get",
                        delay:1000,
                        contentType: "application/json;charset=utf-8",
                        //message:"该用户名已被占用",
                        data:{
                            userName:function(){
                                return $("#userName").val();
                            }
                        },
                        dataFilter: function(data, type) {
                            //alert(data);
                            if (data == 1) {
                                return false;
                            }
                            else {
                                return true;
                            }
                        }
                    }  //remote 验证一直有 bug 能验证 但是显示出错？？？？？？？？？？？？？
*/
                },

                password: {
                    required: true,
                    minlength: 6,
                    maxlength: 16
                },
                password2: {
                    required: true,
                    minlength: 6,
                    maxlength: 16,
                    equalTo: "#password"
                }
            },
            messages: {
                email: {
                    required: "请输入一个有效的邮箱地址",
                    email: "请输入一个有效的邮箱地址",
                    remote: "该邮箱已被注册"
                },
                userName: {
                    required: "请输入一个3-20位的用户名",
                    minlength: "用户名至少包含3位字符",
                    maxlength: "用户名不得超过20位字符",
                    remote:"该用户名已被占用"
                },
                password: {
                    required: "请输入一个有效的密码",
                    minlength: "密码至少要包含6位字符",
                    maxlength: "密码不得超过16位字符"
                },
                password2: {
                    required: "请输入一个有效的密码",
                    minlength: "密码至少要包含6位字符",
                    maxlength: "密码不得超过16位字符",
                    equalTo: "两次密码输入不一致"
                }
            },
            errorElement: "span",
            debug:false,

            errorPlacement: function(error, element) {
                // Add the `help-block` class to the error element
                error.addClass("help-block");

                // Add `has-feedback` class to the parent div.form-group
                // in order to add icons to inputs
                element.parents(".input-group").addClass("has-feedback");

                if (element.prop("type") === "checkbox") {
                    error.appendTo(element.parent("label").parent("div").parent("div").next("div"));
                } else {
                    //error.insertAfter( element );
                    error.appendTo(element.parent("div").parent("div").next("div"));
                }

                // Add the span element, if doesn't exists, and apply the icon classes to it.
                if (!element.next("span")[0]) {
                    $("<span class='glyphicon glyphicon-remove form-control-feedback'></span>").insertAfter(element);
                }
            },
            success: function(label, element) {
                // Add the span element, if doesn't exists, and apply the icon classes to it.
                if (!$(element).next("span")[0]) {
                    $("<span class='glyphicon glyphicon-ok form-control-feedback'></span>").insertAfter($(element));
                }

            },
            highlight: function(element, errorClass, validClass) {
                $(element).parents(".input-group").addClass("has-error").removeClass("has-success");
                $(element).next("span").addClass("glyphicon-remove").removeClass("glyphicon-ok");
            },
            unhighlight: function(element, errorClass, validClass) {
                $(element).parents(".input-group").addClass("has-success").removeClass("has-error");
                $(element).next("span").addClass("glyphicon-ok").removeClass("glyphicon-remove");
            },

        });

});






