package io.github.jerrychin.testbackendjava;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockitoAnnotations;

public class SampleBaseTestCase {

   private AutoCloseable closeable;

   @BeforeEach
   public void openMocks() {
       closeable = MockitoAnnotations.openMocks(this);
   }

   @AfterEach
   public void releaseMocks() throws Exception {
       closeable.close();
   }
}