import com.DeltaFish.mapper.TUserMapper;
import com.DeltaFish.pojo.TUser;
import com.DeltaFish.service.impl.TUserMapperImpl;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;

public class TestTUserMapperImpl {

    static TUserMapper tUserMapper;
    @BeforeClass
    public static void beforeClass()
    {
        tUserMapper = new TUserMapperImpl();
    }

    @Test
    public void testSelectAll() {
        List<TUser> tusers = tUserMapper.selectAll();

        System.out.println(tusers.get(0).getUserName());
        System.out.println(tusers.get(0).getPassword());
        assertNotNull(tusers);
    }
}
