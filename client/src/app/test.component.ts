import {Component, OnInit} from "@angular/core";
import {Router} from "@angular/router";
/**
 * Created by bishal on 5/22/17.
 */

@Component({
  selector: 'test-root',
  template: `
        <button (click)="logout()">logout</button>
  `,
  styleUrls: ['./app.component.css']
})
export class TestComponent implements OnInit{
    abc:string;

    constructor(private router: Router){}

    ngOnInit(){
      this.abc=localStorage.getItem('token');
      console.log(this.abc);
    }

    logout(){
      localStorage.removeItem("token");
      this.router.navigate(['login']);
    }
}
