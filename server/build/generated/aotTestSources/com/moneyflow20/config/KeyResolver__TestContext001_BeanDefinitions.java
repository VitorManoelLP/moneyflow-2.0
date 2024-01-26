package com.moneyflow20.config;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link KeyResolver}.
 */
@Generated
public class KeyResolver__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'keyResolver'.
   */
  public static BeanDefinition getKeyResolverBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(KeyResolver.class);
    beanDefinition.setInstanceSupplier(KeyResolver::new);
    return beanDefinition;
  }
}
