/*
Copyright (C) 2016-2024 Sysdig

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.sysdig.jenkins.plugins.sysdig.domain.vm.report;

import java.io.Serializable;
import java.util.Optional;

public class PublishDateByVendor implements Serializable {
  private String nvd;
  private String vulndb;
  private String cisakev;

  public Optional<String> getNvd() {
    return Optional.ofNullable(nvd);
  }

  public void setNvd(String nvd) {
    this.nvd = nvd;
  }

  public Optional<String> getVulndb() {
    return Optional.ofNullable(vulndb);
  }

  public void setVulndb(String vulndb) {
    this.vulndb = vulndb;
  }

  public Optional<String> getCisakev() {
    return Optional.ofNullable(cisakev);
  }

  public void setCisakev(String cisakev) {
    this.cisakev = cisakev;
  }
}