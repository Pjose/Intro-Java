package com.pj.intro.testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ countCharOccuranceTest.class, squareTest.class })
public class AllTests {

}
