package com.xyz.solution;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        AnimalTest.class,
        BirdTest.class,
        ButterflyTest.class,
        CaterpillarTest.class,
        ChickenTest.class,
        ClownFishTest.class,
        DolhpinTest.class})
public class AllTests {

}
