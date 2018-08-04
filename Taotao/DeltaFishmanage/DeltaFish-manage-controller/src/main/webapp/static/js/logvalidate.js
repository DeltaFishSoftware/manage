$(document).ready(function() {
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

        $("#userName,#password").change(function() {
            $("#userNameinfo .notice").empty();
            $("#passwordinfo .notice").empty();
        }),

        $("#regform").validate({

            ignore: ".ignore",
            rules: {
                userName: {
                    required: true,
                    minlength: 3,
                    maxlength: 20
                },
                password: {
                    required: true,
                    minlength: 6,
                    maxlength: 16
                },
            },
            messages: {
                userName: {
                    required: "请输入一个3-20位的用户名",
                    minlength: "用户名至少包含3位字符",
                    maxlength: "用户名不得超过20位字符",
                    remote: "该用户已被占用"
                },
                password: {
                    required: "请输入一个有效的密码",
                    minlength: "密码至少要包含6位字符",
                    maxlength: "密码不得超过16位字符"
                },
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



