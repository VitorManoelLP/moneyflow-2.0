package com.moneyflow20.config;

import com.moneyflow20.service.AccountManager;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfigurationSource;

/**
 * Bean definitions for {@link AuthenticationConfiguration}.
 */
@Generated
public class AuthenticationConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'authenticationConfiguration'.
   */
  private static BeanInstanceSupplier<AuthenticationConfiguration> getAuthenticationConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<AuthenticationConfiguration>forConstructor(AccountManager.class)
            .withGenerator((registeredBean, args) -> new AuthenticationConfiguration$$SpringCGLIB$$0(args.get(0)));
  }

  /**
   * Get the bean definition for 'authenticationConfiguration'.
   */
  public static BeanDefinition getAuthenticationConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AuthenticationConfiguration.class);
    beanDefinition.setTargetType(AuthenticationConfiguration.class);
    ConfigurationClassUtils.initializeConfigurationClass(AuthenticationConfiguration.class);
    beanDefinition.setInstanceSupplier(getAuthenticationConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configure'.
   */
  private static BeanInstanceSupplier<SecurityFilterChain> getConfigureInstanceSupplier() {
    return BeanInstanceSupplier.<SecurityFilterChain>forFactoryMethod(AuthenticationConfiguration.class, "configure", HttpSecurity.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(AuthenticationConfiguration.class).configure(args.get(0)));
  }

  /**
   * Get the bean definition for 'configure'.
   */
  public static BeanDefinition getConfigureBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SecurityFilterChain.class);
    beanDefinition.setInstanceSupplier(getConfigureInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean definition for 'password'.
   */
  public static BeanDefinition getPasswordBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AuthenticationConfiguration.class);
    beanDefinition.setTargetType(BCryptPasswordEncoder.class);
    beanDefinition.setInstanceSupplier(BeanInstanceSupplier.<BCryptPasswordEncoder>forFactoryMethod(AuthenticationConfiguration.class, "password").withGenerator((registeredBean) -> AuthenticationConfiguration.password()));
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'corsConfigurationSource'.
   */
  private static BeanInstanceSupplier<CorsConfigurationSource> getCorsConfigurationSourceInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CorsConfigurationSource>forFactoryMethod(AuthenticationConfiguration.class, "corsConfigurationSource")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(AuthenticationConfiguration.class).corsConfigurationSource());
  }

  /**
   * Get the bean definition for 'corsConfigurationSource'.
   */
  public static BeanDefinition getCorsConfigurationSourceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CorsConfigurationSource.class);
    beanDefinition.setInstanceSupplier(getCorsConfigurationSourceInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'authenticationManager'.
   */
  private static BeanInstanceSupplier<AuthenticationManager> getAuthenticationManagerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<AuthenticationManager>forFactoryMethod(AuthenticationConfiguration.class, "authenticationManager", org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(AuthenticationConfiguration.class).authenticationManager(args.get(0)));
  }

  /**
   * Get the bean definition for 'authenticationManager'.
   */
  public static BeanDefinition getAuthenticationManagerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AuthenticationManager.class);
    beanDefinition.setInstanceSupplier(getAuthenticationManagerInstanceSupplier());
    return beanDefinition;
  }
}
