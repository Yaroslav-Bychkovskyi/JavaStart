package SpringTest;

public class LookupDemo {
    public static void main(String[] args) {
        GenericXmlAplicationContext ctx = new GenericXmlAplicationContext();
        ctx.load("classpath:lookup.xml");
        DemoBean abstractBean = (DemoBean) ctx.getBean("abstractLookupBean");
        DemoBean standartBean = (DemoBean) ctx.getBean("abstractLookupBean");
        displayInfo(standartBean);
        displayInfo(abstractBean);
    }

    public static void displayInfo(DemoBean bean) {
        MyHelper helper1 = bean.getMyHelper();
        MyHelper helper2 = bean.getMyHelper();
        System.out.println("Helper Instances the Same?: " + (helper1 == helper2));
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("lookupDemo");
        for (int x = 0; x < 100000; x++){
            MyHelper helper = bean.getMyHelper();
            helper.doSomethingHelpful();
        }
        stopWatch.stop();
        System.out.println("100000 gets took " + stopWatch.getTotalTimeMillis() + "ms");
    }
}
