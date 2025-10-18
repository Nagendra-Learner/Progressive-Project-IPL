import { Team } from "./Team";

export class Cricketer {
    
    cricketerId: number;
    team: Team;
    cricketerName: string;
    age: number;
    nationality: string;
    experience: number;
    role: string;
    totalRuns: number;
    totalWickets: number;

    constructor(cricketerId: number, cricketerName: string, age: number, nationality: string, experience: number, role: string, totalRuns: number, totalWickets: number, team: Team)
    {
        this.cricketerId = cricketerId;
        this.team = team;
        this.cricketerName = cricketerName;
        this.age = age;
        this.nationality = nationality;
        this.experience = experience;
        this.role = role;
        this.totalRuns = totalRuns;
        this.totalWickets = totalWickets;
    }

    displayInfo():void
    {
        console.log(`Cricketer ID: ${this.cricketerId}`);
        console.log(`Team ID: ${this.team.teamId}`);
        console.log(`Cricketer Name: ${this.cricketerName}`);
    }
   
}





