public class ResearchCourse extends CourseType {

    private String researchTopic;
    private boolean hasPresentation;

    public ResearchCourse(String researchTopic, boolean hasPresentation) {
        super("Research Based Evaluation");
        this.researchTopic = researchTopic;
        this.hasPresentation = hasPresentation;
    }

    @Override
    public void evaluate() {
        System.out.println(
            "Evaluating research on topic: " + researchTopic +
            (hasPresentation ? " with presentation." : " without presentation.")
        );
    }
}
