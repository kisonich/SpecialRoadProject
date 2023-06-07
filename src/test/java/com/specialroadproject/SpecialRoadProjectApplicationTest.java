package com.specialroadproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.specialroadproject.controller.AppController;
        import com.specialroadproject.entity.ValueSingleton;
        import org.junit.jupiter.api.Test;
        import org.mockito.Mock;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.context.SpringBootTest;

        import static org.junit.jupiter.api.Assertions.assertEquals;
        import static org.mockito.Mockito.when;
@SpringBootTest
class SpecialRoadProjectApplicationTest {

    @Mock
    ValueSingleton valueSingleton;

    @Autowired
    AppController appController;

    @Test
    void testSetValue() {
        String result = appController.setValue(5).get("result");
        assertEquals("success", result);
    }

    @Test
    void testGetValue() {
        int mockValue = 10;
        when(valueSingleton.getValue()).thenReturn(mockValue);
        int expected = 51;
        int result = appController.getValue(5, 1).get("result");
        assertEquals(expected, result);
    }

}
