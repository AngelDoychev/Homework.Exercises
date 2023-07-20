package UnitTestingExercise.p06_TirePressureMonitoringSystem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class AlarmTest {
    private Alarm alarm;
    private Sensor mockSensor;
    @Before
    public void setup(){
        mockSensor = Mockito.mock(Sensor.class);
        alarm = new Alarm(mockSensor);
    }
    @Test
    public void testIfAlarmIsOnBecauseOfLowPressure(){
        Mockito.when(mockSensor.popNextPressurePsiValue()).thenReturn(12d);
        alarm.check();
        Assert.assertTrue(alarm.getAlarmOn());
    }
    @Test
    public void testIfAlarmIsOnBecauseOfHighPressure(){
        Mockito.when(mockSensor.popNextPressurePsiValue()).thenReturn(22d);
        alarm.check();
        Assert.assertTrue(alarm.getAlarmOn());
    }
}