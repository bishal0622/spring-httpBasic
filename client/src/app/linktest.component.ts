import {Component, OnInit} from "@angular/core";
import {Router} from "@angular/router";
import {Login} from "./service";

@Component({
  selector: 'linktest-root',
  templateUrl: './linktest.component.html',
})
export class LinktestComponent implements OnInit{
  authentication:boolean;

  constructor(private login:Login, private router: Router){}

  ngOnInit(){
    console.log("login walla re"+this.login.isAuthenticated());
    this.authentication=this.login.isAuthenticated();
    console.log("testing boolean");
    //undefined
    console.log(this.authentication);
    this.login.test();


  }

  clear(){
    localStorage.removeItem("token");
    this.router.navigate(['']);
  }


}
