package com.faforever.client.stats.domain;

import java.util.HashMap;
import java.util.Map;

public enum Unit {
  AEON_ACU("ual0001"),
  CYBRAN_ACU("url0001"),
  UEF_ACU("uel0001"),
  SERAPHIM_ACU("xsl0001"),
  CORONA("uaa0303"),
  GEMINI("ura0303"),
  WASP("uea0303"),
  IAZYNE("xsa0303"),
  PARAGON("xab1401"),
  MAVOR("ueb2401"),
  YOLONA_OSS("xsb2401"),
  CZAR("uaa0310"),
  SOUL_RIPPER("ura0401"),
  AHWASSA("xsa0402"),
  SCATHIS("url0401"),
  GALACTIC_COLOSSUS("ual0401"),
  MONKEYLORD("url0402"),
  MEGALITH("xrl0403"),
  FATBOY("uel0401"),
  YTHOTHA("xsl0401"),
  TEMPEST("uas0401"),
  ATLANTIS("ues0401"),
  NOVAX_CENTER("xeb2402"),

  CHARIOT("uaa0107"),
  ALUMINAR("uaa0104"),
  SKYHOOK("ura0107"),
  DRAGON_FLY("ura0104"),
  C6_COURIER("uea0107"),
  C14_STAR_LIFTER("uea0104"),
  CONTINENTAL("xea0306"),
  VISH("xsa0107"),
  VISHALA("xsa0104"),

  SALVATION("xab2307"),

  UNKNOWN(null);

  private static final Map<String, Unit> fromId;

  static {
    fromId = new HashMap<>();
    for (Unit unit : values()) {
      fromId.put(unit.id, unit);
    }
  }

  private final String id;

  Unit(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public static Unit fromId(String id) {
    Unit unit = fromId.get(id);
    if (unit == null) {
      return UNKNOWN;
    }
    return unit;
  }
}