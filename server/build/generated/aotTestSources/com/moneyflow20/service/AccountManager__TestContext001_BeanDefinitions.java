package com.moneyflow20.service;

import com.moneyflow20.repository.AccountRepository;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AccountManager}.
 */
@Generated
public class AccountManager__TestContext001_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'accountManager'.
   */
  private static BeanInstanceSupplier<AccountManager> getAccountManagerInstanceSupplier() {
    return BeanInstanceSupplier.<AccountManager>forConstructor(AccountRepository.class)
            .withGenerator((registeredBean, args) -> new AccountManager(args.get(0)));
  }

  /**
   * Get the bean definition for 'accountManager'.
   */
  public static BeanDefinition getAccountManagerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AccountManager.class);
    beanDefinition.setInstanceSupplier(getAccountManagerInstanceSupplier());
    return beanDefinition;
  }
}
