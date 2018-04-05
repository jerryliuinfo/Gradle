package com.hawk.aop.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * Created by 01370340 on 2018/4/5.
 */

public class AopPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        System.out.println("========================");
        System.out.println("hello AopPlugin!");
        System.out.println("========================");
    }
}
