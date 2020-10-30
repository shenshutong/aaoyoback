package com.bgs.aoyoback.pojo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AoyoGroupTechnician {

  private long groupTechnicianId;
  private long groupId;
  private String groupTechnicianName;
  private String groupTechnicianImg;
  private String groupTechnicianDesc;
  private long deleteFlag;


}
