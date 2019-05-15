import org.apache.log4j.Logger;

public class flumetest {
//    protected static final Log logger = LogFactory.getLog(flumetest.class);
    public static Logger logger = Logger.getLogger(flumetest.class);

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 4; i++) {
            // 每隔两秒log输出一下当前系统时间戳
            logger.info("222-222-222");
            //System.out.println(new Date().getTime());
            Thread.sleep(2000);
        }

//            // 每隔两秒log输出一下当前系统时间戳
//            logger.info("222-222-222");
//            //System.out.println(new Date().getTime());
//            Thread.sleep(2000);




//            try {
//                throw new Exception("exception msg");
//            }
//            catch (Exception e) {
//                logger.error("error:" + e.getMessage());
//
    }
}
