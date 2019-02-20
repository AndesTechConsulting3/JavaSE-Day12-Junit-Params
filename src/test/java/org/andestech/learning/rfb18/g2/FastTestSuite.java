package org.andestech.learning.rfb18.g2;


import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({AppTest.class, App2Test.class})
@Categories.IncludeCategory(IWeekendTest.class)
@Categories.ExcludeCategory(IFastTest.class)
public class FastTestSuite {

}
