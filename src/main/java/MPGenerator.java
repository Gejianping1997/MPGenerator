import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MPGenerator {
    public static void main(String[] args) {
        //创建代码生成器
        AutoGenerator mpg = new AutoGenerator();
        //指定模板引擎  默认velocity
        //mpg.setTemplateEngine(new FreemarkerTemplateEngine());

        //全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOpen(false);
        gc.setOutputDir("C:\\Dev\\Future\\MPGenerator\\src\\main\\java\\code_generate");
        /** 是否覆盖已有文件 */
        gc.setFileOverride(true);
        /** XML是否需要BaseResultMap */
        gc.setBaseResultMap(true);
        /** XML是否显示字段 */
        gc.setBaseColumnList(true);
        gc.setControllerName("%sController");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setAuthor("gjp");
        gc.setIdType(IdType.UUID);
        mpg.setGlobalConfig(gc);
        /** 数据源配置 */
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUrl("jdbc:mysql://192.168.202.128:3306/RELAX_COURSE?autoReconnect=true&autoReconnectForPools=true&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC");

//        dsc.setDbType(DbType.ORACLE);
//        dsc.setDriverName("oracle.jdbc.driver.OracleDriver");
//        dsc.setUrl("jdbc:oracle:thin:@192.168.0.189:1521:orcl");

        dsc.setUsername("root");
        dsc.setPassword("root");
        mpg.setDataSource(dsc);
        //策略配置
        StrategyConfig sc = new StrategyConfig();
//        sc.setTablePrefix(""); //表名前缀
        sc.setInclude("TEACH_PLAN_MEDIA");
        /** 表名生成策略 */
        sc.setNaming(NamingStrategy.underline_to_camel);
        sc.setEntityBuilderModel(true);
        sc.setEntityLombokModel(true);
        mpg.setStrategy(sc);
        //包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.example.demo");
        pc.setEntity("entity");
        pc.setController("controller");
        pc.setService("service");
        pc.setServiceImpl("serviceImpl");
        pc.setMapper("mapper");
        pc.setXml("mapper");
        mpg.setPackageInfo(pc);

        mpg.execute();
    }
}
