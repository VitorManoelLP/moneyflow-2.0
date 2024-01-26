package org.springframework.boot.actuate.autoconfigure.amqp;

import java.util.Map;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.actuate.health.HealthContributor;

/**
 * Bean definitions for {@link RabbitHealthContributorAutoConfiguration}.
 */
@Generated
public class RabbitHealthContributorAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'rabbitHealthContributorAutoConfiguration'.
   */
  public static BeanDefinition getRabbitHealthContributorAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RabbitHealthContributorAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(RabbitHealthContributorAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'rabbitHealthContributor'.
   */
  private static BeanInstanceSupplier<HealthContributor> getRabbitHealthContributorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<HealthContributor>forFactoryMethod(RabbitHealthContributorAutoConfiguration.class, "rabbitHealthContributor", Map.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RabbitHealthContributorAutoConfiguration.class).rabbitHealthContributor(args.get(0)));
  }

  /**
   * Get the bean definition for 'rabbitHealthContributor'.
   */
  public static BeanDefinition getRabbitHealthContributorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HealthContributor.class);
    beanDefinition.setInstanceSupplier(getRabbitHealthContributorInstanceSupplier());
    return beanDefinition;
  }
}
