package ExceptionHandling;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TryCatchTestTest {
        TryCatch tryCatch;

    @BeforeEach
    void setUp() {
        tryCatch = new TryCatch();

    }


    @AfterEach
    void tearDown() {
    }

    @Test
    void trycCatchcanAdd(){
        assertEquals(4, tryCatch.add(2,2));
        assertEquals(5, tryCatch.add(2,3));
    }

    void trycCatchcanAddDouble(){
        assertEquals(16.3, tryCatch.add(8.1,8.2));
    }
//
//    @Test
//    void calculatorIsNotNull(){
//        assertNotNull();
//    }
}