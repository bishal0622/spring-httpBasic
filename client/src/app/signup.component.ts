import {Component} from "@angular/core";
import {User} from "./user.model";
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

  user: User;

  constructor(private login:Login,
              private router: Router){
    this.user=new User();
  }

  save(){
      this.login.createUser(this.user).subscribe(res=> console.log("data"),()=>console.log("errror"));
  }

}
// subscribe(res=> console.log("data"),()=>console.log("errror"))
