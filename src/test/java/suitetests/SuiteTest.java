package suitetests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({SuiteTest1.class,SuiteTest2.class})
public class SuiteTest {
}
