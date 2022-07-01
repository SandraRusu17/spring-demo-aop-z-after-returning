package com.luv2code.aopdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

// spring pure java configuration
@Configuration
// spring AOP Proxy Support
@EnableAspectJAutoProxy
// component scan for components and aspects ( Recurse packages )
@ComponentScan("com.luv2code.aopdemo")
public class DemoConfig {
}
