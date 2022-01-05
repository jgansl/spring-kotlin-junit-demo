# Spring Kotlin Demo using TTD (JUnit5)
- Bottom Up


## F.I.R.S.T. Principles for Automated Tests
- fast
- isolated - independent, arbitrary orderr - else hard to debug on ci server
  - refactor - currently not respecting isolating in testing
    - i.e. move delete up to run first - changing order of tests should not fail
    - need to isolate
    - no guarantee from junit that tests will be run in order written
- repeatable - same result each time, not flaky
- self-validating - actual vs expected (assertions)
- timely - with(or even before (TDD)) production code
- 