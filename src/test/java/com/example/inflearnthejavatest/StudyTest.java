//package com.example.inflearnthejavatest;
//
//import com.example.inflearnthejavatest.domain.Study;
//import org.junit.jupiter.api.*;
//import org.junit.jupiter.api.extension.ParameterContext;
//import org.junit.jupiter.api.extension.RegisterExtension;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.aggregator.AggregateWith;
//import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
//import org.junit.jupiter.params.aggregator.ArgumentsAggregationException;
//import org.junit.jupiter.params.aggregator.ArgumentsAggregator;
//import org.junit.jupiter.params.converter.ArgumentConversionException;
//import org.junit.jupiter.params.converter.ConvertWith;
//import org.junit.jupiter.params.converter.SimpleArgumentConverter;
//import org.junit.jupiter.params.provider.*;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assumptions.assumeTrue;
//
////@ExtendWith(FindSlowTestExtension.class)
//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//class StudyTest {
//
//    int value = 1;
//
//    @RegisterExtension
//    static FindSlowTestExtension findSlowTestExtension =
//            new FindSlowTestExtension(1000L);
//
//    @Order(2)
//    @FastTest
//    @DisplayName("스터디 만들기")
//    void create_new_study() {
////        assertNotNull(study);
////        assertEquals(StudyStatus.DRAFT, study.getStatus(), "스터디를 처음 만들면 상태값이 DRATF여야 한다.");
////        assertTrue(study.getLimit() > 0, "스터디 최대 참석 가능 인원은 0보다 커야 한다.");
//
//        /* */
//
////        assertAll(
////                () -> assertNotNull(study),
////                () -> assertEquals(StudyStatus.DRAFT, study.getStatus(),
////                        () -> "스터디를 처음 만들면 " + StudyStatus.DRAFT + "상태다."),
////                () -> assertTrue(study.getLimit() >0 , "스터디 최대 참석 가능 인원은 0보다 커야 한다.")
////        );
//
//        /* */
//
////        String test_env = System.getenv("TEST_ENV");
////        test_env = "LOCAL";
////        assumeTrue("LOCAL".equalsIgnoreCase(test_env));
//
//        /* */
//        System.out.println(this);   // 아래 this 해시값과 다름 (즉, 다른 객체)
//        System.out.println(value++);
//        Study study = new Study(1);
//
//    }
//
//    @Test
//    @Order(1)
////    @SlowTest
//    @DisplayName("스터디 만들기2")
//    void create_new_study_again() throws InterruptedException {
//        Thread.sleep(1005L);
//        System.out.println(this);   // 위 this 해시값과 다름 (즉, 다른 객체)
//        System.out.println("create1 " + value++);
//    }
//
//    @DisplayName("스터디 만들기3")
//    @RepeatedTest(value =10, name = "{displayName}, {currentRepetition}/{totalRepetitions}")
//    void repeatTest(RepetitionInfo repetitionInfo) {
//        System.out.println("테에스트 " + repetitionInfo.getCurrentRepetition() + "/"
//                                      + repetitionInfo.getTotalRepetitions());
//    }
//
//    @DisplayName("스터디 만들기4")
//    @ParameterizedTest(name = "{index} {displayName} message={0}")
//    @ValueSource(ints = {10, 20, 40})
////    @EmptySource
////    @NullSource
////    @NullAndEmptySource
//    void parameterizedTest(Integer limi) {
//        System.out.println(limi);
//    }
//
//    @DisplayName("스터디 만들기5")
//    @ParameterizedTest(name = "{index} {displayName} message={0}")
//    @ValueSource(ints = {10, 20, 40})
//    void parameterizedTest2(@ConvertWith(StudyConverter.class) Study study) {
//        System.out.println(study.getLimit());
//    }
//
//    static class StudyConverter extends SimpleArgumentConverter {
//        @Override
//        protected Object convert(Object source, Class<?> targetType) throws ArgumentConversionException {
//            assertEquals(Study.class, targetType, "Can only covert to Study");
//            return new Study(Integer.parseInt(source.toString()));
//        }
//    }
//
//
//    @DisplayName("스터디 만들기5")
//    @ParameterizedTest(name = "{index} {displayName} message={0}")
//    @CsvSource({"10, '자바 스터디'", "20, 스프링"})
//    void parameterizedTest3(Integer limit, String name) {
//        Study study = new Study(limit, name);
//        System.out.println(study);
//    }
//
//
//    @DisplayName("스터디 만들기6")
//    @ParameterizedTest(name = "{index} {displayName} message={0}")
//    @CsvSource({"10, '자바 스터디'", "20, 스프링"})
//    void parameterizedTest4(ArgumentsAccessor argumentsAccessor) {
//        Study study = new Study(argumentsAccessor.getInteger(0), argumentsAccessor.getString(1));
//        System.out.println(study);
//    }
//
//
//    @DisplayName("스터디 만들기7")
//    @ParameterizedTest(name = "{index} {displayName} message={0}")
//    @CsvSource({"10, '자바 스터디'", "20, 스프링"})
//    void parameterizedTest5(@AggregateWith(StudyAggregator.class) Study study) {
//        System.out.println(study);
//    }
//
//
//    static class StudyAggregator implements ArgumentsAggregator {
//        @Override
//        public Object aggregateArguments(ArgumentsAccessor argumentsAccessor, ParameterContext parameterContext) throws ArgumentsAggregationException {
//            return new Study(argumentsAccessor.getInteger(0), argumentsAccessor.getString(1));
//        }
//    }
//
//
//    // @TestInstance(TestInstance.Lifecycle.PER_CLASS)
//    // 클래스에 해당 어노테이션이 붙어있으면
//    // BeforeAll, AfterAll이 꼭 static이어야 할 필요는 없음
//
//    @BeforeAll
//    static void beforeAll() {
//        System.out.println("before all");
//    }
//
//    @AfterAll
//    static void afterAll() {
//        System.out.println("after all");
//    }
//
//    @BeforeEach
//    void beforeEach() {
//        System.out.println("before each");
//    }
//
//    @AfterEach
//    void afterEach() {
//        System.out.println("After Each");
//    }
//
//
//}