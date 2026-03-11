package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Equipo {
    private String idStanding;
    private String intRank;
    private String idTeam;
    private String strTeam;
    private String strBadge;
    private String idLeague;
    private String strLeague;
    private String strSeason;
    private String strForm;
    private String strDescription;
    private String intPlayed;
    private String intWin;
    private String intLoss;
    private String intDraw;
    private String intGoalsFor;
    private String intGoalsAgainst;
    private String intGoalDifference;
    private String intPoints;
}
