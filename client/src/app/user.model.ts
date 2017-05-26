// import {Role} from "./role.model";
export class UserModel {
  public id?: any;
  public name?: string;
  public password?: string;
  // public role:Role;

  constructor(
    id ?: any,
    name ?: string,
    password ?: string,
    // role ?: Role
  ) {
    this.id = id ? id:null;
    this.name = name ? name : null;
    this.password = password ? password : null;
    // this.role = role ? role : new Role();
  }
}
