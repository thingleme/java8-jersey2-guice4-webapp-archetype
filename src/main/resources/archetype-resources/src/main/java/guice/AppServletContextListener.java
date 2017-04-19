#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import com.squarespace.jersey2.guice.JerseyGuiceModule;
import com.squarespace.jersey2.guice.JerseyGuiceUtils;

public class AppServletContextListener extends GuiceServletContextListener {

  @Override
  protected Injector getInjector() {
    Injector injector = Guice.createInjector(
      Stage.PRODUCTION,
      new JerseyGuiceModule("__HK2_Generated_0"),
      new ServletModule(),
      new AppModule()
    );

    JerseyGuiceUtils.install(injector);

    return injector;
  }

}
