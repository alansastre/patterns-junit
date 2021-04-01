package com.patterns.state1;

import com.patterns.behavioral.state.state1.OnState;
import com.patterns.behavioral.state.state1.State;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("OnState")
public class OnStateTest {



    @Test
    @DisplayName("onStatenotNull")
    void onStatenotNull()  {
        State start = new OnState();
        assertNotNull(start);
    }
    @Test
    @DisplayName("onStateisOnState")
    void onStateisOnState()  {
        State start = new OnState();
        assertTrue(start instanceof OnState);

    }


}
