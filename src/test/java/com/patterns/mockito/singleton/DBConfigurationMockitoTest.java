package com.patterns.mockito.singleton;

import com.patterns.creational.singleton.lazy.DBConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.OngoingStubbing;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;

@ExtendWith(MockitoExtension.class)
class DBConfigurationMockitoTest {

    @Mock
    DBConfiguration config1;


    @Test
    @DisplayName("TestSingletonMockito")
    void testSingletonMockito() {

        when(config1.getUrl()).thenReturn(
                "jdbc:mariadb://locahost:65999"
        );
        when(config1.getDatabase()).thenReturn(
                "mysql"
        );
        when(config1.getUser()).thenReturn(
                "root"
        );
        when(config1.getPassword()).thenReturn(
                "admin01"
        );


        String arg1 = config1.getUrl();
        String arg2 = config1.getDatabase();
        String arg3 = config1.getUser();
        String arg4 = config1.getPassword();

        verify(config1, times(1)).getUrl();
        verify(config1, times(1)).getDatabase();
        verify(config1, times(1)).getUser();
        verify(config1, times(1)).getPassword();


    }

}