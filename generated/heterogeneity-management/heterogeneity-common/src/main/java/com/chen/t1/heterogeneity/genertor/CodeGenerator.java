package  com.chen.t1.heterogeneity.genertor;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.builder.GeneratorBuilder;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class CodeGenerator {
    
    /** 初始化表信息 */
    private static final String [] tableNames = new String [] {"activity_theme"
    };


    public static void main(String[] args) {
        System.out.println("aaa");
        String projectPath = System.getProperty("user.dir");
        String moduleName = "/heterogeneity-management/heterogeneity-common";
        projectPath=projectPath+moduleName;

        String finalProjectPath = projectPath;
        FastAutoGenerator.create("jdbc:mysql://127.0.0.1:3306/heterogeneity?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&serverTimezone=UTC",
            "root", "1024.")
            .globalConfig(builder -> {
                builder.author("chen_q_i@163.com") // 设置作者
//                    .enableSwagger() // 开启 swagger 模式
                    .fileOverride() // 覆盖已生成文件
                    .outputDir(finalProjectPath + "/src/main/java"); // 指定输出目录
            })
            .packageConfig(builder -> {
                builder.parent("com.chen") // 设置父包名
                    .moduleName("heterogeneity") // 设置父包模块名
                    .pathInfo(Collections.singletonMap(OutputFile.mapperXml, finalProjectPath + "/src"
                        + "/resources/mapper/" )); // 设置mapperXml生成路径
            })
            .strategyConfig(builder -> {
                builder.addInclude("order_base") // 设置需要生成的表名
                ; // 设置过滤表前缀
            })
//            .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
            .execute();
        // 代码生成器

    }
    
    
}
