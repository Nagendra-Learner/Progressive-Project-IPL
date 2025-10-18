import { Team } from "./Team";

export class Match {
    matchId: number;
    firstTeam: Team;
    secondTeam: Team;
    //team: Team;
    matchDate: Date;
    venue: string;
    result: string;
    status: string;
    winnerTeam: Team;

    constructor(matchId: number, firstTeam: Team, secondTeam: Team, matchDate: Date, venue: string, result: string, status: string, winnerTeam: Team)
    {
        this.matchId = matchId;
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        this.matchDate = matchDate;
        //this.team = team;
        this.venue = venue;
        this.result = result;
        this.status = status;
        this.winnerTeam = winnerTeam;
    }

    displayInfo(): void
    {
        console.log(`Match ID: ${this.matchId}, Match Date: ${this.matchDate}, Venue: ${this.venue}`);
    }
}