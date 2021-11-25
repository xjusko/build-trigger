package io.xstefank.model.json;

import java.util.List;

public class BuildJMSModifyPayload {

    public String email;
    public List<String> product;
    public Environment environment;
    public String upstream;
    public String script;

    public static BuildJMSModifyPayload from(BuildModifyInfo buildModifyInfo, String email) {
        BuildJMSModifyPayload buildJMSModifyPayload = new BuildJMSModifyPayload();

        buildJMSModifyPayload.email = email;
        buildJMSModifyPayload.product = buildModifyInfo.product;
        buildJMSModifyPayload.environment = buildModifyInfo.environment;
        buildJMSModifyPayload.upstream = buildModifyInfo.upstream;
        buildJMSModifyPayload.script = buildModifyInfo.script;

        return buildJMSModifyPayload;
    }

    @Override
    public String toString() {
        return "BuildJMSModifyPayload{" +
            "email='" + email + '\'' +
            ", product=" + product +
            ", environment=" + environment +
            ", upstream='" + upstream + '\'' +
            ", script='" + script + '\'' +
            '}';
    }
}