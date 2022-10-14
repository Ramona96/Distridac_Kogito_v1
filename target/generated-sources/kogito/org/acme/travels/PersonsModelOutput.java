/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.acme.travels;

import org.kie.kogito.MapInput;
import org.kie.kogito.MapInputId;
import org.kie.kogito.MapOutput;
import java.util.Map;
import java.util.HashMap;
import org.kie.kogito.MappableToModel;
import org.kie.kogito.Model;

@org.kie.kogito.codegen.Generated(value = "kogito-codegen", reference = "persons", name = "Persons", hidden = true)
public class PersonsModelOutput implements org.kie.kogito.Model, MapInput, MapInputId, MapOutput, MappableToModel<PersonsModel> {

    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "person")
    @javax.validation.Valid()
    private org.acme.travels.Person person;

    public org.acme.travels.Person getPerson() {
        return person;
    }

    public void setPerson(org.acme.travels.Person person) {
        this.person = person;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "stored")
    @javax.validation.Valid()
    private java.lang.Boolean stored;

    public java.lang.Boolean getStored() {
        return stored;
    }

    public void setStored(java.lang.Boolean stored) {
        this.stored = stored;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "adult")
    @javax.validation.Valid()
    private java.lang.Boolean adult;

    public java.lang.Boolean getAdult() {
        return adult;
    }

    public void setAdult(java.lang.Boolean adult) {
        this.adult = adult;
    }

    @Override()
    public PersonsModel toModel() {
        PersonsModel result = new PersonsModel();
        result.setId(getId());
        result.setPerson(getPerson());
        result.setStored(getStored());
        result.setAdult(getAdult());
        return result;
    }
}
