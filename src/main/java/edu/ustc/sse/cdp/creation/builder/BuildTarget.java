package edu.ustc.sse.cdp.creation.builder;

public class BuildTarget {

    private String header;
    private String body;
    private String footer;

    public static BuildTarget.InnerBuilder builder() {
        return new BuildTarget.InnerBuilder();
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    private BuildTarget(InnerBuilder innerBuilder) {
        this.header = innerBuilder.header;
        this.body = innerBuilder.body;
        this.footer = innerBuilder.footer;
    }

    static class InnerBuilder {

        private String header;
        private String body;
        private String footer;

        public InnerBuilder() {

        }

        public InnerBuilder setHeader(String header) {
            this.header = header;
            return this;
        }

        public InnerBuilder setBody(String body) {
            this.body = body;
            return this;
        }

        public InnerBuilder setFooter(String footer) {
            this.footer = footer;
            return this;
        }

        public BuildTarget build() {
            return new BuildTarget(this);
        }
    }
}
