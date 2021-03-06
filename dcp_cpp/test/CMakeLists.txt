# CMakeLists.txt
# By Sebastian Raaphorst, 2019.

cmake_minimum_required(VERSION 3.12)
project(dcp_test)

# Enables testing from this directory downwards.
enable_testing(true)

# Prepare "Catch" library for other executables.
set(CATCH_INCLUDE_DIR ${CMAKE_CURRENT_SOURCE_DIR})
add_library(Catch INTERFACE)
target_include_directories(Catch INTERFACE ${CATCH_INCLUDE_DIR})

# Make main executable that will be linked with other tests.
set(TEST_SOURCES ${CMAKE_CURRENT_SOURCE_DIR}/main.cpp)
add_executable(tests ${TEST_SOURCES})
target_link_libraries(tests Catch)

set(TEST_LIST
        TestDay001
        TestDay002
        TestDay004
        TestDay006
        TestDay012
        TestDay014
        TestDay016
        TestDay027
        TestDay030
        TestDay035
        TestDay038
        TestDay056
        TestDay064
        TestDay104
        TestDay109
        TestDay113
        TestDay114
        TestDay118
        TestDay140
        TestDay145
        TestDay154
        TestDay155
        TestDay156
        TestDay157
        TestDay161
        TestDay162
        TestDay164
        TestDay177
        TestDay180
        TestDay184
        TestDay208
        TestDay214
        TestDay223
        TestDay248
        TestDay256
        TestDay268
        TestDay276
        TestDay277
        TestDay304
        TestDay321)

foreach(testname ${TEST_LIST})
    set(testfile ${testname}.cpp)
    add_executable(${testname} ${testfile} ${TEST_SOURCES})
    target_link_libraries(${testname} Catch)
endforeach()

# Add cpp to everything in TEST_LIST and make a "TestAll" target to run all test cases.
list(TRANSFORM TEST_LIST APPEND ".cpp")
add_executable(TestAll ${TEST_LIST} ${TEST_SOURCES})
target_link_libraries(TestAll Catch)
