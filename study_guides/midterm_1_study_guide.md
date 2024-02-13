# CS 1632 Midterm 1 Exam Study Guide - Spring 2024

The midterm is going to be **open book** but **individual work**.  

The midterm will cover everything up to and including Automated Web Systems
Testing.  I recommend you review the slides and the textbook (See syllabus.md
for which chapters are required reading.  The reading is also on the last slide
of each lecture).  Going over the TopHat questions will be quite helpful too.
You are also expected to have completed Exercises 1 and 2, and Supplementary
Exercise 1, and be able to answer related questions.  

The exam will consist of these types of questions:
  * Multiple choice questions
  * Fill in the blank questions
  * Short answer questions (explain a concept, discuss pros/cons, etc.)
  * JUnit / Gherkin / Cucumber code tracing questions
  * JUnit / Gherkin / Cucumber coding questions

If you want more JUnit or Cucumber coding practice, look inside the
[midterm_1_practice](midterm_1_practice) folder for more examples.

Here are the key topics to study in preparation for the test.

**Note: the items in bold are learning goals that require application of your
knowledge.  Either you have to apply your knowledge to a piece of code, or you
need to apply a testing tool to a specific problem.**

## TESTING THEORY AND TERMINOLOGY
* Exhaustive Testing Impossibility: Even a single method can have an enormous number of input combinations, making it impractical to test every scenario. Consider the range of inputs, different states of the system, and interaction with other components, all of which exponentially increase complexity.
* Equivalence Class Partitioning: This technique divides input data of a software unit into partitions of equivalent data from which test cases can be derived, aiming to reduce the total number of tests while covering all possible scenarios.
* Boundary and Interior Values: Identifying these values helps in testing limits and central values of input domains, effectively catching common off-by-one errors and ensuring functionality across the input range.
* Base, Edge, and Corner Cases: Base cases are typical conditions, edge cases are at the boundaries, and corner cases are where multiple boundaries intersect, each requiring specific attention during testing.
* Static vs Dynamic Testing: Static testing involves reviewing code, documentation, and design without executing the program, while dynamic testing involves running the software to check for errors and examining its operational behavior.
* Black Box / White Box / Gray Box Testing: Black box testing examines software functionality without peering into its internal structures or workings. White box testing requires detailed inside knowledge of the software's internals. Gray box testing is a blend, utilizing limited knowledge of the software's internal workings.
* Be able to define all terminology introduced or fill in the blank.

## REQUIREMENTS ANALYSIS
* Be able to argue why requirements should not specify implementation.
* Be able to clearly define the difference between requirements verification and requirements validation.
* Be ready to give a few examples of checks performed during requirements validation and what they mean
  * validity, completeness, consistency, realism, ambiguity, verifiability
* Be able to differentiate between Functional Requirements vs Non-Functional Requirements (Quality Attributes)
* Be able to define all terminology introduced or fill in the blank.

## TEST PLANS
* Be able to give examples of preconditions and postconditions.
* Be able to explain what a regression test is and why it is important.
* Be able to explain what problems in a test case may cause it to become not reproducible.
* Be able to explain what problems in a test case cause it to not be independent.
* Be able to explain the hierarchy of test cases, test plans, test suites.
* Be able to define all terminology introduced or fill in the blank.
* **Be able to critique an example test case on what problems it has.**
  * Problems with preciseness, reproducibility, independence.
* **Be able to tell problems with a test plan based on the traceability matrix.**
* **Be able to write a traceability matrix given requirements and test
  cases.**

## DEFECT REPORTING
* Be able to explain the difference between a defect and a candidate for enhancement.
* Be able to explain the difference between explicit and implicit requirements.
* Be able to explain why implicit requirements make it sometimes hard to tell whether something is a defect or an enhancement.
* Be able to explain why sometimes software is released with known bugs inside them.
* Be able to explain why bad coding style is not a defect.
* Be able to explain what triage and sub-triage are.
* Be able to define all terminology introduced or fill in the blank.
* **Be able to critique an example defect report on what problems it may have.**
  * Problems with preciseness and reproducibility.

## AUTOMATED TESTING
* Be able to discuss in-depth of the pros and cons of automated testing.
  * Why automated testing can be brittle and narrow.
* Be able to explain what test automation looks like in a blackbox testing context and a whitebox testing context.

## UNIT TESTING
* Be able to list the 4 levels of testing in a hierarchy: acceptance/system/integration/unit.
* **Be able to write unit tests in JUnit given a test case.**
* **Be able to write integration tests in JUnit given a test case.**
* **Be able to write JUnit code to create stubs, test doubles, mocks,**
* **Be able to write JUnit code to perform both state verification and behavior verification.**
* Testing private methods
  * Be able to discuss why/why not one might not decide to test them.
  * **Be able to write code to test a private method using Java reflection.**

## TDD
* Be able to draw the red-green-refactor loop.
  * Be able to explain each of its components.
* Be able to explain principles of TDD (including explaining acronyms):
  * YAGNI
  * KISS
  * "Fake it 'til you make it"
  * Avoid interdependency
  * Avoid slow tests
* Be able to discuss the benefits and drawbacks of TDD.
  * When to use it?
  * When not to use it?

## BDD
* Be able to discuss two problems in TDD that BDD solves.
  * Hard to get feedback about requirements from stakeholders
  * Hard to change requirements mid-development due to tests breaking
* Be able to discuss drawbacks of BDD.
  * Drawbacks of specification by example
* **Be able to take Gherkin and Cucumber code and trace through it and explain the end result.**
* **Be able to write Gherkin and Cucumber code given a test scenario, with reuse of Cucumber steps.**

## AUTOMATED (WEB) SYSTEMS TESTING
* Be able to explain why testing a GUI web application involves a lot of text
  testing, just like text UI applications.
* Be able to discuss reasons why testing an HTML verbatim against an expected
  HTML page is not desirable and how Selenium solves those problems.
* Be able to explain why in Selenium, there is an option to select
  different locator strings for the same target element.
* Be able to explain why race conditions occur and how to solve them.
