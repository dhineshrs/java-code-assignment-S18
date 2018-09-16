package com.xyz.solution;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        AnimalTest.class,
        BirdTest.class,
        DuckTest.class,
        ChickenTest.class,
        RoosterTest.class,
        ParrotWithDogsTest.class,
        ParrotWithCatsTest.class,
        ParrotWithRoostersTest.class,
        FishTest.class,
        SharkTest.class,
        ClownFishTest.class,
        ButterflyTest.class,
        CaterpillarTest.class,
        DolhpinTest.class})
public class AllTests {

}
