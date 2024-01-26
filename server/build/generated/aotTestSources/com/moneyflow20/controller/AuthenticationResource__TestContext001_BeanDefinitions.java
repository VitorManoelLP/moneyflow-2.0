package com.moneyflow20.controller;

import com.moneyflow20.service.AccountManager;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.security.authentication.AuthenticationManager;

/**
 * Bean definitions for {@link AuthenticationResource}.
 */
@Generated
public class AuthenticationResource__TestContext001_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'authenticationResource'.
   */
  private static BeanInstanceSupplier<AuthenticationResource> getAuthenticationResourceInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<AuthenticationResource>forConstructor(AccountManager.class, AuthenticationManager.class)
            .withGenerator((registeredBean, args) -> new AuthenticationResource(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'authenticationResource'.
   */
  public static BeanDefinition getAuthenticationResourceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AuthenticationResource.class);
    beanDefinition.setInstanceSupplier(getAuthenticationResourceInstanceSupplier());
    return beanDefinition;
  }
}
