class MemberDetail extends React.Component {
    render() {
        return (
            <div key={idx}>
                    <span>{m.name}</span>
                    <span>{m.email}</span>
            </div>
        );
    }
}