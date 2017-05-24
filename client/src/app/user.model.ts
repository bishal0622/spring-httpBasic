// import {Role} from "./role.model";
export class UserModel {
  public id?: any;
  public username?: string;
  public password?: string;
  // public role:Role;

  constructor(
    id ?: any,
    username ?: string,
    password ?: string,
    // role ?: Role
  ) {
    this.id = id ? id:null;
    this.username = username ? username : null;
    this.password = password ? password : null;
    // this.role = role ? role : new Role();
  }
}
