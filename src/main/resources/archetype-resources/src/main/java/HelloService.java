#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public interface HelloService {

  CompletableFuture<Map<String, Object>> sayHello(String name);

}
