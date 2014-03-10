public class TestClass {
    private String testField;

    public TestClass(String testField) {
        this.testField = testField;
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "testField='" + testField + '\'' +
                '}';
    }
}
