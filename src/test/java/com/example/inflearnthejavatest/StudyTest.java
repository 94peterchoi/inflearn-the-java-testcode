package com.example.inflearnthejavatest;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

    @FastTest
    @DisplayName("스터디 만들기")
    void create_new_study() {
//        assertNotNull(study);
//        assertEquals(StudyStatus.DRAFT, study.getStatus(), "스터디를 처음 만들면 상태값이 DRATF여야 한다.");
//        assertTrue(study.getLimit() > 0, "스터디 최대 참석 가능 인원은 0보다 커야 한다.");

        /* */

//        assertAll(
//                () -> assertNotNull(study),
//                () -> assertEquals(StudyStatus.DRAFT, study.getStatus(),
//                        () -> "스터디를 처음 만들면 " + StudyStatus.DRAFT + "상태다."),
//                () -> assertTrue(study.getLimit() >0 , "스터디 최대 참석 가능 인원은 0보다 커야 한다.")
//        );

        /* */

//        String test_env = System.getenv("TEST_ENV");
//        test_env = "LOCAL";
//        assumeTrue("LOCAL".equalsIgnoreCase(test_env));

        /* */

        Study study = new Study(1);


    }

    @SlowTest
    @DisplayName("스터디 만들기2")
    void create_new_study_again() {
        System.out.println("create1");
    }

    @DisplayName("스터디 만들기3")
    @RepeatedTest(value =10, name = "{displayName}, {currentRepetition}/{totalRepetitions}")
    void repeatTest(RepetitionInfo repetitionInfo) {
        System.out.println("테에스트 " + repetitionInfo.getCurrentRepetition() + "/"
                                      + repetitionInfo.getTotalRepetitions());
    }

    @DisplayName("스터디 만들기4")
    @ParameterizedTest(name = "{index} {displayName} message={0}")
    @ValueSource(strings = {"날씨가", "많이", "추워지고", "있네요"})
    void parameterizedTest(String message) {
        System.out.println(message);
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("before all");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("after all");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("before each");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After Each");
    }


}