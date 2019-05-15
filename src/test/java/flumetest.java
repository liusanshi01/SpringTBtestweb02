import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class flumetest {
//    protected static final Log logger = LogFactory.getLog(flumetest.class);
    public static Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws InterruptedException {

        while (true) {
            // 每隔两秒log输出一下当前系统时间戳
            logger.info("log info:222");
            //System.out.println(new Date().getTime());
            Thread.sleep(2000);




//            try {
//                throw new Exception("exception msg");
//            }
//            catch (Exception e) {
//                logger.error("error:" + e.getMessage());
//            }

        }
    }
}
