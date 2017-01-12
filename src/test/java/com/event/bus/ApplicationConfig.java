package com.event.bus;

import com.event.bus.spring.EnableEventBus;
import com.oracle.jrockit.jfr.UseConstantPool;
import com.sun.xml.internal.messaging.saaj.util.Base64;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Project: EventBus
 * Module Desc:com.event.bus
 * User: zjprevenge
 * Date: 2017/1/12
 * Time: 17:25
 */
@Configuration
@ComponentScan(basePackages = "com.event.bus")
@EnableEventBus
public class ApplicationConfig {
}
