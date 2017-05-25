// import {Role} from "./role.model";
export class User {
  public id?: any;
  public name?: string;
  public password?: string;
  public userType?: number;
  // public role:Role;

  constructor(
    id ?: any,
    name ?: string,
    password ?: string,
    userType ?: number
    // role ?: Role
  ) {
    this.id = id ? id:null;
    this.name = name ? name : null;
    this.password = password ? password : null;
    this.userType = userType ? userType :null;
    // this.role = role ? role : new Role();
  }
}
