#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class HelloServiceImpl implements HelloService {

  public CompletableFuture<Map<String, Object>> sayHello(String name) {
    return CompletableFuture.supplyAsync(() -> {
      Map<String, Object> result = new HashMap<>();
      result.put("hello", name);
      return result;
    });
  }

}
