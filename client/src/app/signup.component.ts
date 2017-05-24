import {Component} from "@angular/core";
import {UserModel} from "./user.model";
import {Login} from "./service";
import {Router} from "@angular/router";
/**
 * Created by bishal on 5/23/17.
 */
@Component({
  selector: 'signup-root',
  templateUrl: './signup.component.html'
})

export class SignUpComponent {

  user: UserModel;

  constructor(private login:Login,
              private router: Router){
    this.user=new UserModel();
  }

  save(){
      this.login.createUser(this.user);
  }

}
