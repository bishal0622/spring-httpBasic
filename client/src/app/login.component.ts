import {Component} from "@angular/core";
import {CredentialModel} from "./credential.model";
import {Login} from "./service";
import {Router} from "@angular/router";
/**
 * Created by bishal on 5/22/17.
 */

@Component({
  selector: 'login-root',
  templateUrl: './login.component.html'
})

export class LoginDialogComponent {

  simpleObject:CredentialModel;

  constructor(private login:Login,
  private router: Router){
    this.simpleObject=new CredentialModel();
  }

  save(){
    this.login.create(btoa(this.simpleObject.username+":"+this.simpleObject.password));
    this.router.navigate(['test']);
    window.location.reload();
  }

}
