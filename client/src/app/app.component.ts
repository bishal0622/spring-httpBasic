import { Component } from '@angular/core';
import {CredentialModel} from "./credential.model";
import {Login} from "./service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  simpleObject:CredentialModel;

  constructor(private login:Login){
    this.simpleObject=new CredentialModel();
  }

  save(){
    this.login.create(btoa(this.simpleObject.username+":"+this.simpleObject.password));
  }

}
